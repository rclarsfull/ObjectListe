class ObjektListe{
  
  private ObjektListenelement erster,letzter;
  private int size;
  
  ObjektListe(){
    erster=null;
    letzter=null;
    size=0;
  }
  
  public void addLastElement(Object element){
    if (erster==null) {
      erster=new ObjektListenelement(element);
      letzter=erster;
    } else if (erster==letzter){
        erster.setFolgender(new ObjektListenelement(element));
        letzter=erster.getFolgender();
        erster.getFolgender().setVorheriger(erster);
      } else{
        ObjektListenelement temp=erster;
        while (temp.getFolgender()!=null) { 
          temp=temp.getFolgender();
        } // end of while
        temp.setFolgender(new ObjektListenelement(element));
        temp.getFolgender().setVorheriger(temp);
        letzter=temp.getFolgender();
        temp=null;
        }
    size++;
   }
  
  public void addFirstElement(Object element){
    if (erster==null) {
      erster=new ObjektListenelement(element);
      letzter=erster;
    } else {
      ObjektListenelement temp= erster;
      erster=new ObjektListenelement(element);
      erster.setFolgender(temp);
      temp.setVorheriger(erster);
      temp=null;
    } // end of if-else
    size++;
    }
  
  public ObjektListenelement removeFirst(){
     if (erster==null) {
      return null; 
     } else if (erster==letzter) {
        ObjektListenelement temp=erster;
        erster.setFolgender(null);
        letzter.setVorheriger(null);
        erster=null;
        letzter=null;
        size--;
        return temp;  
        } else {
        ObjektListenelement temp=erster;
        erster.getFolgender().setVorheriger(null);  
        erster=erster.getFolgender();
        temp.setFolgender(null);
        size--;
        return temp;  
        } // end of if
    }
  
  public ObjektListenelement removeLast(){
    if (erster==null) return null;
    if (letzter==erster) {
      ObjektListenelement temp=erster;
      erster.setFolgender(null);
      letzter.setVorheriger(null);
      erster=null;
      letzter=null;
      size--;
      return temp;  
    } else {
      ObjektListenelement temp=letzter;
      temp.getVorheriger().setFolgender(null);
      letzter=temp.getVorheriger();
      temp.setVorheriger(null);
      size--;
      return temp;
    } // end of if
    }
  
  public ObjektListenelement get(int index){
    if (index==0) {
      return erster;
    } // end of if
    if (index==size-1) {
      return letzter;
    } // end of if
    if (index>=size) {
      return null;
    } // end of if
    ObjektListenelement temp=erster;
    for (int i=0;i<=index ;i++ ) {
      temp=temp.getFolgender();
    } // end of for
    return temp;
    }
  
  public ObjektListenelement remove(int index){
    ObjektListenelement temp=get(index);
    
    }
    
  public ObjektListenelement getFirst(){
    return erster;
    }
  
  public ObjektListenelement getLast(){
    return letzter;
    }
  
  public String toString(){
    String ausgabe="ObjektListe{" ;
    ObjektListenelement temp=erster;
    while (temp!=null) { 
      ausgabe+=temp.toString();
      if (temp.getFolgender()!=null) {
        ausgabe+=";";
      } // end of if
      temp=temp.getFolgender();
    } // end of while
    ausgabe+="}";
    temp=null;
    return ausgabe;
  }
  
  public int getSize(){
     return size;
    }
}
