package com.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Rss {	
    public static void main(String args[]) throws Exception {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("e:\\rss[1].xml"));
            NodeList rss = doc.getElementsByTagName("rss");
            NodeList channel = rss.item(0).getChildNodes();
            NodeList _n = channel.item(0).getChildNodes();
            int countList = (int) _n.getLength();
            for (int i = 0; i < countList; i++) {
                if ("item".equals(_n.item(i).getNodeName())) {
                    NodeList itemList = _n.item(i).getChildNodes();
                    for (int j = 0; j < itemList.getLength(); j++) {
						if ("title".equals(itemList.item(j).getNodeName())) {
							System.out.println("Title:" + itemList.item(j).getFirstChild().getNodeValue());
						}
						if ("link".equals(itemList.item(j).getNodeName())) {
							System.out.println("Link:" + itemList.item(j).getFirstChild().getNodeValue());
						}
						if ("description".equals(itemList.item(j).getNodeName())) {
							System.out.println("Description:" + itemList.item(j).getFirstChild().getNodeValue());
						}
						if ("enclosure".equals(itemList.item(j).getNodeName())) {
							System.out.println("Enclosure:" + itemList.item(j).getAttributes().getNamedItem("url").getNodeValue());
						}
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("e.toString()=====" + e.toString());
        }
    }    
}
