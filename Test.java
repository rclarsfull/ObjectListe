class Test{
  
public static void main(String[]args){
    ObjektListe test=new ObjektListe();
    
    test.addFirstElement(new String("0"));
    
    test.addLastElement(new String("1"));
    test.addLastElement(new String("2"));
    test.addLastElement(new String("3"));
    test.addLastElement(new String("4"));
    
    test.addFirstElement(new String("-1"));
    
    
    
    System.out.println(test.toString()+"\nSize: "+test.getSize());
    
    System.out.println(test.removeFirst());
    
    System.out.println(test.toString()+"\nSize: "+test.getSize());
    
    System.out.println(test.removeLast());
    
    System.out.println(test.toString()+"\nSize: "+test.getSize());
    
  
  
  }
}
