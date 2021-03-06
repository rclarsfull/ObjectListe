class ObjektListenelement{
  
  private Object objekt;
  private ObjektListenelement vorheriger,folgender;
  
  ObjektListenelement(Object o){
    vorheriger=null;
    folgender=null;
    objekt=o;
    }
  ObjektListenelement(Object o, ObjektListenelement vorheriger){
    this.vorheriger=vorheriger;
    folgender=null;
    objekt=o;
    }
  ObjektListenelement(Object o, ObjektListenelement vorheriger, ObjektListenelement folgender){
    this.vorheriger=vorheriger;
    this.folgender=folgender;
    objekt=o;
    }
  
  public void setVorheriger(ObjektListenelement element){
    vorheriger=element;
    }
  public void setFolgender(ObjektListenelement element){
    folgender=element;
    }
  public void setObject(Object object){
    this.objekt=objekt;
    }
  
  public ObjektListenelement getVorheriger(){
     return vorheriger;
    }
  public ObjektListenelement getFolgender(){
     return folgender;
    }
  public Object getObject(){
    return objekt;
    }
  
  public String toString(){
    return objekt.toString();
    }
  
  
  
  }
