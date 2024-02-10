package by.belstu.it.kovalevich.basejava;

public class Main{
    public static void main(String[] args) {
         /**
         * @return -nothing
          * @throws -nothing
          * @param -nothing
         */
        JavaTest javaTest = new JavaTest(){
            @Override
            public void delete(char newchar){

                System.out.println("Ничего не удалено пофик");
            }
        };
        javaTest.replace('q', '*');
        javaTest.delete('5');
    }
}
