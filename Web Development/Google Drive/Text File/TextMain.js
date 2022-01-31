// Firstly addTextFile() function call then  it will pass name of the file and id of that file   to 
//addFileHTML() function then on whatever we click that function will call .(eg. rename ,delete, etc). 
(function(){

    let btnAddTextFile = document.querySelector("#addTextFile");
    btnAddTextFile.addEventListener("click", addTextFile);
    function addTextFile(){
        let rname = prompt("Enter text file's name");
        if(rname != null){
            rname = rname.trim();
        }

        if(!rname){ // empty name validation
            alert("Empty name is not allowed.");
            return;
        }

        // uniqueness validation
        let alreadyExists = resources.some(r => r.rname == rname && r.pid == cfid);
        if(alreadyExists == true){
            alert(rname + " is already in use. Try some other name");
            return;
        }

        let pid = cfid;
        rid++;
        addTextFileHTML(rname, rid, pid);
        resources.push({
            rid: rid,
            rname: rname,
            rtype: "text-file",
            pid: cfid,
            isBold: true,
            isItalic: false,
            isUnderline: false,
            bgColor: "#000000",
            textColor: "#FFFFFF",
            fontFamily: "cursive",
            fontSize: 22,
            content: "I am a new file."
        });
        saveToStorage();
    }

    function deleteTextFile(){
        let spanDelete = this;
        let divTextFile = spanDelete.parentNode;
        let divName = divTextFile.querySelector("[purpose='name']");

        let fidTBD = parseInt(divTextFile.getAttribute("rid"));
        let fname = divName.innerHTML;

        let sure = confirm(`Are you sure you want to delete ${fname}?`);
        if(!sure){
            return;
        }

        // html
        divContainer.removeChild(divTextFile);
        // ram
        let ridx = resources.findIndex(r => r.rid == fidTBD);
        resources.splice(ridx, 1);

        //  storage
        saveToStorage();
    }

    function renameTextFile(){
        let nrname = prompt("Enter file's name");
        if(nrname != null){
            nrname = nrname.trim();
        }

        if(!nrname){ // empty name validation
            alert("Empty name is not allowed.");
            return;
        }

        let spanRename = this;
        let divTextFile = spanRename.parentNode;
        let divName = divTextFile.querySelector("[purpose=name]");
        let orname = divName.innerHTML;
        let ridTBU = parseInt(divTextFile.getAttribute("rid"));
        if(nrname == orname){
            alert("Please enter a new name.");
            return;
        }

        let alreadyExists = resources.some(r => r.rname == nrname && r.pid == cfid);
        if(alreadyExists == true){
            alert(nrname + " already exists.");
            return;
        }

        // change html
        divName.innerHTML = nrname;
        // change ram
        let resource = resources.find(r => r.rid == ridTBU);
        resource.rname = nrname;
        // change storage
        saveToStorage();
    }

    function viewTextFile(){
        let spanView = this;
        let divTextFile = spanView.parentNode;
        let divName = divTextFile.querySelector("[purpose=name]");
        let fname = divName.innerHTML;
        let fid = parseInt(divTextFile.getAttribute("rid"));

        let divNotepadMenuTemplate = templates.content.querySelector("[purpose=notepad-menu]");
        let divNotepadMenu = document.importNode(divNotepadMenuTemplate, true);
        divAppMenuBar.innerHTML = "";
        divAppMenuBar.appendChild(divNotepadMenu);

        let divNotepadBodyTemplate = templates.content.querySelector("[purpose=notepad-body]");
        let divNotepadBody = document.importNode(divNotepadBodyTemplate, true);
        divAppBody.innerHTML = "";
        divAppBody.appendChild(divNotepadBody);

        divAppTitle.innerHTML = fname;
        divAppTitle.setAttribute("rid", fid);

        let spanSave = divAppMenuBar.querySelector("[action=save]");
        let spanBold = divAppMenuBar.querySelector("[action=bold]");
        let spanItalic = divAppMenuBar.querySelector("[action=italic]");
        let spanUnderline = divAppMenuBar.querySelector("[action=underline]");
        let inputBGColor = divAppMenuBar.querySelector("[action=bg-color]");
        let inputTextColor = divAppMenuBar.querySelector("[action=fg-color]");
        let selectFontFamily = divAppMenuBar.querySelector("[action=font-family]");
        let selectFontSize = divAppMenuBar.querySelector("[action=font-size]");
        let spanDownload = divAppMenuBar.querySelector("[action=download]");
        let spanForUpload = divAppMenuBar.querySelector("[action=forupload]");
        let inputUpload = divAppMenuBar.querySelector("[action=upload]");
        let textArea = divAppBody.querySelector("textArea");

        spanSave.addEventListener("click", saveNotepad);
        spanBold.addEventListener("click", makeNotepadBold);
        spanItalic.addEventListener("click", makeNotepadItalic);
        spanUnderline.addEventListener("click", makeNotepadUnderline);
        inputBGColor.addEventListener("change", changeNotepadBGColor);
        inputTextColor.addEventListener("change", changeNotepadTextColor);
        selectFontFamily.addEventListener("change", changeNotepadFontFamily);
        selectFontSize.addEventListener("change", changeNotepadFontSize);
        spanDownload.addEventListener("click", downloadNotepad);

        inputUpload.addEventListener("change", uploadNotepad);

        spanForUpload.addEventListener("click", function(){
            inputUpload.click();
        })

        let resource = resources.find(r => r.rid == fid);
        spanBold.setAttribute("pressed", !resource.isBold);
        spanItalic.setAttribute("pressed", !resource.isItalic);
        spanUnderline.setAttribute("pressed", !resource.isUnderline);
        inputBGColor.value = resource.bgColor;
        inputTextColor.value = resource.textColor;
        selectFontFamily.value = resource.fontFamily;
        selectFontSize.value = resource.fontSize;
        textArea.value = resource.content;

        spanBold.dispatchEvent(new Event("click"));
        spanItalic.dispatchEvent(new Event("click"));
        spanUnderline.dispatchEvent(new Event("click"));
        inputBGColor.dispatchEvent(new Event("change"));
        inputTextColor.dispatchEvent(new Event("change"));
        selectFontFamily.dispatchEvent(new Event("change"));
        selectFontSize.dispatchEvent(new Event("change"));
    }

    function downloadNotepad(){
        let fid = parseInt(divAppTitle.getAttribute("rid"));
        let resource = resources.find(r => r.rid == fid);
        let divNotepadMenu = this.parentNode;
        
        let strForDownload = JSON.stringify(resource);
        let encodedData = encodeURIComponent(strForDownload);
        
        let aDownload = divNotepadMenu.querySelector("a[purpose=download]");
        aDownload.setAttribute("href", "data:text/json; charset=utf-8, " + encodedData);
        aDownload.setAttribute("download", resource.rname + ".json");

        aDownload.click();
    }

    function uploadNotepad(){
        let file = window.event.target.files[0]; 
        let reader = new FileReader();
        reader.addEventListener("load", function(){
            let data = window.event.target.result;
            let resource = JSON.parse(data);

            let spanBold = divAppMenuBar.querySelector("[action=bold]");
            let spanItalic = divAppMenuBar.querySelector("[action=italic]");
            let spanUnderline = divAppMenuBar.querySelector("[action=underline]");
            let inputBGColor = divAppMenuBar.querySelector("[action=bg-color]");
            let inputTextColor = divAppMenuBar.querySelector("[action=fg-color]");
            let selectFontFamily = divAppMenuBar.querySelector("[action=font-family]");
            let selectFontSize = divAppMenuBar.querySelector("[action=font-size]");
            let textArea = divAppBody.querySelector("textArea");

            spanBold.setAttribute("pressed", !resource.isBold);
            spanItalic.setAttribute("pressed", !resource.isItalic);
            spanUnderline.setAttribute("pressed", !resource.isUnderline);
            inputBGColor.value = resource.bgColor;
            inputTextColor.value = resource.textColor;
            selectFontFamily.value = resource.fontFamily;
            selectFontSize.value = resource.fontSize;
            textArea.value = resource.content;

            spanBold.dispatchEvent(new Event("click"));
            spanItalic.dispatchEvent(new Event("click"));
            spanUnderline.dispatchEvent(new Event("click"));
            inputBGColor.dispatchEvent(new Event("change"));
            inputTextColor.dispatchEvent(new Event("change"));
            selectFontFamily.dispatchEvent(new Event("change"));
            selectFontSize.dispatchEvent(new Event("change"));
        })
        reader.readAsText(file);       
    }

    function saveNotepad(){ 
        let fid = parseInt(divAppTitle.getAttribute("rid"));
        let resource = resources.find(r => r.rid == fid);

        let spanBold = divAppMenuBar.querySelector("[action=bold]");
        let spanItalic = divAppMenuBar.querySelector("[action=italic]");
        let spanUnderline = divAppMenuBar.querySelector("[action=underline]");
        let inputBGColor = divAppMenuBar.querySelector("[action=bg-color]");
        let inputTextColor = divAppMenuBar.querySelector("[action=fg-color]");
        let selectFontFamily = divAppMenuBar.querySelector("[action=font-family]");
        let selectFontSize = divAppMenuBar.querySelector("[action=font-size]");
        let textArea = divAppBody.querySelector("textArea");

        resource.isBold = spanBold.getAttribute("pressed") == "true";
        resource.isItalic = spanItalic.getAttribute("pressed") == "true";
        resource.isUnderline = spanUnderline.getAttribute("pressed") == "true";
        resource.bgColor = inputBGColor.value;
        resource.textColor = inputTextColor.value;
        resource.fontFamily = selectFontFamily.value;
        resource.fontSize = selectFontSize.value;
        resource.content = textArea.value;

        saveToStorage();
    }

    function makeNotepadBold(){ 
        let textArea = divAppBody.querySelector("textArea");
        let isPressed = this.getAttribute("pressed") == "true";
        if(isPressed == false){
            this.setAttribute("pressed", true);
            textArea.style.fontWeight = "bold";
        } else {
            this.setAttribute("pressed", false);
            textArea.style.fontWeight = "normal";
        }
    }
    function makeNotepadItalic(){ 
        let textArea = divAppBody.querySelector("textArea");
        let isPressed = this.getAttribute("pressed") == "true";
        if(isPressed == false){
            this.setAttribute("pressed", true);
            textArea.style.fontStyle = "italic";
        } else {
            this.setAttribute("pressed", false);
            textArea.style.fontStyle = "normal";
        }
    }
    function makeNotepadUnderline(){ 
        let textArea = divAppBody.querySelector("textArea");
        let isPressed = this.getAttribute("pressed") == "true";
        if(isPressed == false){
            this.setAttribute("pressed", true);
            textArea.style.textDecoration = "underline";
        } else {
            this.setAttribute("pressed", false);
            textArea.style.textDecoration = "none";
        }
    }

    function changeNotepadBGColor(){ 
        let color = this.value;
        let textArea = divAppBody.querySelector("textArea");
        textArea.style.backgroundColor = color;
    }

    function changeNotepadTextColor(){ 
        let color = this.value;
        let textArea = divAppBody.querySelector("textArea");
        textArea.style.color = color;
    }

    function changeNotepadFontFamily(){ 
        let fontFamily = this.value;
        let textArea = divAppBody.querySelector("textArea");
        textArea.style.fontFamily = fontFamily;
    }

    function changeNotepadFontSize(){ 
        let fontSize = this.value;
        let textArea = divAppBody.querySelector("textArea");
        textArea.style.fontSize = fontSize;
    }


    function addTextFileHTML(rname, rid, pid){
        let divTextFileTemplate = templates.content.querySelector(".text-file");
        let divTextFile = document.importNode(divTextFileTemplate, true); // makes a copy

        let spanRename = divTextFile.querySelector("[action=rename]");
        let spanDelete = divTextFile.querySelector("[action=delete]");
        let spanView = divTextFile.querySelector("[action=view]");
        let divName = divTextFile.querySelector("[purpose=name]");

        spanRename.addEventListener("click", renameTextFile);
        spanDelete.addEventListener("click", deleteTextFile);
        spanView.addEventListener("click", viewTextFile);
        divName.innerHTML = rname;
        divTextFile.setAttribute("rid", rid);
        divTextFile.setAttribute("pid", pid);

        divContainer.appendChild(divTextFile);
    }

})();
