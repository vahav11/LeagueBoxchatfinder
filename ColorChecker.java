import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;

public class ColorChecker {
		
		private static int xcord=0;
		private static int ycord=0;
		private static  Color RGB=null;
		
		public ColorChecker() {
			
		}
		
		public ColorChecker(Color c, int x, int y) {
			RGB=c;
			xcord= x;
			ycord= y;		
		}
		public static boolean isLocationCorrect() throws AWTException {
			boolean holder=false;
			Robot pixel= new Robot();
			Color correctvalue=pixel.getPixelColor(xcord, ycord);
			if(!(getRed()==correctvalue.getRed()&&getBlue()==correctvalue.getBlue()&&getGreen()==correctvalue.getGreen()))
			holder=true;
			else holder=false;
			
			return holder;
		}
		public static int getRed() {
			return RGB.getRed();
		}
		public static int getBlue() {
			return RGB.getBlue();
		}
		public static int getGreen() {
			return RGB.getGreen();
		}
		public static String tostring() {
			return "RGB"+" red:"+RGB.getRed()+" green:"+RGB.getGreen()+ " blue:"+RGB.getBlue()+" xcord" +xcord+" ycord"+ycord;
		}
		public static int getYcord() {
			return ycord;
		}
		public static int getXcord() {
			return xcord;
		}
		
	}


