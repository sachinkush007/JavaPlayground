package oops_concept;

public interface Interface_Demo {
    public abstract void show();
}
class Test implements Interface_Demo{
   @Override
   public void show(){
       System.out.println("implementing method");
   }
   public static void main(String[] args){
       /*oops_concept.Interface_Demo i=new oops_concept.Interface_Demo() {
           @Override
           public void show() {
               System.out.println("we can not create object of interface ");
           }
       };*/
       Test t=new Test();
       t.show();
   }
}
