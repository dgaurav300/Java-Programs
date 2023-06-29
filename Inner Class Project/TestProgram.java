class TestProgram extends Animal
{
    public static void main(String[] args) {
     TestProgram t=new TestProgram();
     t.canSound();
     t.greet();

       
    }


   @Override
   public void greet(){
    System.out.println("Hello World");
   }
    @Override
    protected void canSound() {
        System.out.println("I can bark");
    }
}