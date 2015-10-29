import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.filter.*;
import java.util.Random;


public class Question_one implements PlugInFilter {
	ImagePlus imp;

	public int setup(String arg, ImagePlus imp) {
		this.imp = imp;
		imp.draw();
		imp.getProcessor();
		return DOES_ALL;
	}

	public void run(ImageProcessor ip) {
	
	Random random = new Random();
	int abc = math.gaussian(255);

	ip.add(abc);

	
	}

}
