  static int dia=0;
  static int diameterHeight(Node node)
  {
    int dch=-1;
    int sdch=-1;
    for(Node child:node.children)
    {
      int ch=diameterHeight(child);
      if(ch>dch)
      {
        sdch=dch;
        dch=ch;
      }
      else if(ch>sdch)
      {
        sdch=ch;
      }
    }
    if(dch+sdch+2>dia)
    {
      dia=dch+sdch+2;
    }

    dch+=1;
    return dch;
  }
