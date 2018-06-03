public class Rectangulator {
    public static void main (Strimg[] args) {
int length = integer.ParseInt(args[0]);
int width = integer.ParseInt(args[1]);

rectangle myRectangle = new Rectangle(length, width);

string output = string.format("*** Your Rectangle ***\n\nLength:%d\nwidth:%d\nArea: %d\nPerimeter: %d\n\n",myRectangle.length, myRectangle.width, myrectangle.getArea(), myRectangle.getPerimeter());
System.out.println(output);
    }
}