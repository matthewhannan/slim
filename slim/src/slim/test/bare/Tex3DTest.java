package slim.test.bare;

import java.net.URL;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

import slim.Color;
import slim.GL2D;
import slim.MathUtil;
import slim.SlimException;
import slim.g2d.Image;
import slim.g2d.SpriteBatch;
import slim.util.Utils;

public class Tex3DTest extends GUITestBase {
	public static void main(String[] args) throws SlimException {
		new Tex3DTest().start();
	}

	Image img1;
	SpriteBatch batch;
	
	@Override
	public void init() throws SlimException {
		//init2D();
		GL11.glViewport(0, 0, 800, 600);
		GL2D.setBackground(Color.gray);
		img1 = new Image("res/box1.png");
		batch = new SpriteBatch(12);
	}

	private float rot = 0;

	@Override
	public void render() throws SlimException {
		batch.resetTransform();
		
		batch.drawImage(img1, 20, 20, rot+=0.03f);
		batch.drawImage(img1, 55, 20, 0);
		
		batch.flush();
	}
	
	@Override
	public void update(int delta) throws SlimException {
		
	}

	@Override
	public URL getThemeURL() throws SlimException {
		return Utils.getResource("res/gui/chutzpah/chutzpah.xml");
	}
}
