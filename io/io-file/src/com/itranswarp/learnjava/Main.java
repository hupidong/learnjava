package com.itranswarp.learnjava;

import java.io.File;
import java.io.IOException;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws IOException {
		File currentDir = new File(".");
		listDir(currentDir.getCanonicalFile(),0);
	}

	static void listDir(File dir, int indent) {

		File[] fs = dir.listFiles();
		if (fs != null) {
			for (File f : fs) {
				for(int i=0; i<indent; i++) {
					System.out.print("  ");
				}
				if(f.isDirectory()) {
					System.out.println(f.getName() + "/");

				}else {
					System.out.println(f.getName());
				}
				listDir(f, indent + 1);

			}
		}
	}
}