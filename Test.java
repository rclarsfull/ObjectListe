class Test{
  
public static void main(String[]args){
    ObjektListe test=new ObjektListe();
    
    test.addFirstElement(new String("0"));
    
    test.addLastElement(new String("1"));
    test.addLastElement(new String("2"));
    test.addLastElement(new String("3"));
    test.addLastElement(new String("4"));
    
    test.addFirstElement(new String("-1"));
    
    System.out.println(test+"\n\n");
    
    test.add(new String("test add index 2"),2);
    
    System.out.println(test+"\n\n");
    
    System.out.println(test.remove(2));
    
    System.out.println(test+"\n\n");
    
    
   
    
  
  
  }
}
