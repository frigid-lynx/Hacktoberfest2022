class sample
{
static void area(int a, int b, final double pi)
{
 double result=pi*a*b;
 System.out.println(result);
}
}
class ellipse
{
public static void main(String[] args)
{
   sample.area(4, 6, 3.14);
 }
}
