// Firstly addAlbum() function call then  it will pass name of the Album and id of that Album  to 
//addAlbumHtML() function then on whatever we click that function will call .(eg. rename,delete, etc). 
(function(){

    let btnAddAlbum = document.querySelector("#addAlbum");
    btnAddAlbum.addEventListener("click", addAlbum);

    function addAlbum(){
        let rname = prompt("Enter album's name");
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
        addAlbumHTML(rname, rid, pid);
        resources.push({
            rid: rid,
            rname: rname,
            rtype: "album",
            pid: cfid
        });
        saveToStorage();
    }

    function deleteAlbum(){
        let spanDelete = this;
        let divAlbum = spanDelete.parentNode;
        let divName = divAlbum.querySelector("[purpose='name']");

        let fidTBD = parseInt(divAlbum.getAttribute("rid"));
        let fname = divName.innerHTML;

        let sure = confirm(`Are you sure you want to delete ${fname}?`);
        if(!sure){
            return;
        }

        // html
        divContainer.removeChild(divAlbum);
        // ram
        let ridx = resources.findIndex(r => r.rid == fidTBD);
        resources.splice(ridx, 1);

        //  storage
        saveToStorage();
    }

    function renameAlbum(){
        let nrname = prompt("Enter album's name");
        if(nrname != null){
            nrname = nrname.trim();
        }

        if(!nrname){ // empty name validation
            alert("Empty name is not allowed.");
            return;
        }

        let spanRename = this;
        let divAlbum = spanRename.parentNode;
        let divName = divAlbum.querySelector("[purpose=name]");
        let orname = divName.innerHTML;
        let ridTBU = parseInt(divAlbum.getAttribute("rid"));
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

    function viewAlbum(){
        let spanView = this;
        let divAlbum = spanView.parentNode;
        let divName = divAlbum.querySelector("[purpose=name]");
        let fname = divName.innerHTML;
        let fid = parseInt(divAlbum.getAttribute("rid"));

        let divAlbumMenuTemplate = templates.content.querySelector("[purpose=album-menu]");
        let divAlbumMenu = document.importNode(divAlbumMenuTemplate, true);
        divAppMenuBar.innerHTML = "";
        divAppMenuBar.appendChild(divAlbumMenu);

        let divAlbumBodyTemplate = templates.content.querySelector("[purpose=album-body]");
        let divAlbumBody = document.importNode(divAlbumBodyTemplate, true);
        divAppBody.innerHTML = "";
        divAppBody.appendChild(divAlbumBody);

        divAppTitle.innerHTML = fname;
        divAppTitle.setAttribute("rid", fid);

        let spanAdd = divAlbumMenu.querySelector("[action=add]");
        spanAdd.addEventListener("click", addPictureToAlbum);
    }

    function addPictureToAlbum(){
        let iurl = prompt("Enter an image url");
        if(!iurl){
            return;
        }
        let img = document.createElement("img");
        img.setAttribute("src", iurl);
        img.addEventListener("click", showPictureInMain);

        let divPictureList = divAppBody.querySelector(".picture-list");
        divPictureList.appendChild(img);
    }

    function showPictureInMain(){
        let divPictureMainImg = divAppBody.querySelector(".picture-main > img");
        divPictureMainImg.setAttribute("src", this.getAttribute("src"));

        let divPictureList = divAppBody.querySelector(".picture-list");
        let imgs = divPictureList.querySelectorAll("img");
        for(let i = 0; i < imgs.length; i++){
            imgs[i].setAttribute("pressed", false);
        }
    
        this.setAttribute("pressed", true);
    }

    function addAlbumHTML(rname, rid, pid){
        let divAlbumTemplate = templates.content.querySelector(".album");
        let divAlbum = document.importNode(divAlbumTemplate, true); // makes a copy

        let spanRename = divAlbum.querySelector("[action=rename]");
        let spanDelete = divAlbum.querySelector("[action=delete]");
        let spanView = divAlbum.querySelector("[action=view]");
        let divName = divAlbum.querySelector("[purpose=name]");

        spanRename.addEventListener("click", renameAlbum);
        spanDelete.addEventListener("click", deleteAlbum);
        spanView.addEventListener("click", viewAlbum);
        divName.innerHTML = rname;
        divAlbum.setAttribute("rid", rid);
        divAlbum.setAttribute("pid", pid);

        divContainer.appendChild(divAlbum);
    }
})();
