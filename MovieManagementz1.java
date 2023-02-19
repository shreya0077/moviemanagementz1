class MovieManagementz1
{
        
          public static void main(String args[])
          {
          
          theaterHall bs= new theaterHall();
          bs.setMovie(92,"Pathan","Siddharth Anand",200);
          theaterHall bs2=new theaterHall();
          bs2.setMovie(78,"Titanic","James cameron",300);
          bs.getMovie();
          bs2.getMovie();
          }
}

class theaterHall
{
          private int mNum,mPrice;
          private String mName,mDirector;

               //adding one movie to theaterHall
               public void setMovie(int movieNum,String movieName,String movieDirector,int moviePrice){
               mNum=movieNum;
               mName=movieName;
               mDirector=movieDirector;
               mPrice=moviePrice;
          }
               public void getMovie(){
               System.out.println(mNum+"is"+mName+"which is written by"+mDirector+"and it is price"+mPrice+"rs");
          }
}
          