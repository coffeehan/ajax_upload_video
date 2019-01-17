package cn.svell.jbtest;

import java.io.File;

import com.jfinal.upload.UploadFile;

import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/video")
public class VideoController extends JbootController {
	public void index() {
        renderText("Hello World Jboot");
    }
	
	public void upload() {
    	UploadFile upfile = getFile();
    	File file = upfile.getFile();
    	String filename = file.getName();
    	//String path = getRequest().getSession().getServletContext().getRealPath("/");
    	String type = filename.substring(filename.lastIndexOf("."));
		filename = System.currentTimeMillis() + type;
		String videofile = "E:/svell2019/tmp/" + filename;
		file.renameTo(new File(videofile));
		renderText("ok:"+filename);
    }
}
