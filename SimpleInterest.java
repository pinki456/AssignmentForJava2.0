class SimpleInterest{
   static float rate;
   int p;
   float t, si;
   static
   {
       rate = 5.6f;
   }
   public SimpleInterest(){
       p= 100000;
       t = 2;
   }
   public SimpleInterest(int p, float t){
       this.p= p;
       this.t = t;
   }
   void SI(){
       si = (p*rate*t)/100;
       System.out.println("Simple Interest : " + si);
   }
   public static void main(String args[]){
       SimpleInterest S1 = new SimpleInterest();
       SimpleInterest S2 = new SimpleInterest(250000,2.5f);
       S1.SI();
       S2.SI();

   }
}