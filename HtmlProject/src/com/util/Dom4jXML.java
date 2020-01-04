package com.util;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * ��ȡ��xml�ĵ�,���document����
 * ����Ϊxml���ص�һƪ�����´������ֱ�����У���β����Դ�����ص�ַ��
 */
public class Dom4jXML {
    public static void main(String[] args) throws DocumentException
    {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("D:\\workspaceHP\\HtmlProject\\contact.xml"));
        
        /**
         * �ڵ����Ĳ�������
         */
        
        //��ȡ�ĵ����ڵ�
        Element root = document.getRootElement();
        //�������ǩ������
        System.out.println(root.getName());
        
        
        //��ȡ���ڵ�����������ӽڵ㣨�������ӽڵ���ӽڵ㣩
        List<Element> list = root.elements() ;
        //����List�ķ���
        for (Element e:list){
            System.out.println(e.getName());
            System.out.println(e.getText());
        }
        
        
        //���ָ���ڵ�������ӽڵ�
        Element contactElem = root.element("contact");//����Ҫ֪���Լ�Ҫ�����Ľڵ㡣 
        List<Element> contactList = contactElem.elements();
        for (Element e:contactList){
            System.out.println(e.getName());
        }    
        
        
        //���������ȡ�ӽڵ�ĵݹ麯����
        getChildNodes(root);
        
        
        //��õ�ǰ��ǩ��ָ�����Ƶĵ�һ���ӱ�ǩ
        Element conElem = root.element("contact");
        System.out.println(conElem.getName());
        
        
        //��ø����εı�ǩ��һ��һ��Ļ�ȡ��
        Element nameElem = root.element("contact").element("name");
        System.out.println(nameElem.getName());
        System.out.println(nameElem.getText());
    }
    
    //�ݹ��ѯ�ڵ㺯��,����ڵ�����
    private static void  getChildNodes(Element elem){
        System.out.println(elem.getName());
        Iterator<Node> it=    elem.nodeIterator();
        while (it.hasNext()){
            Node node = it.next();
            if (node instanceof Element){
                Element e1 = (Element)node;
                getChildNodes(e1);
                }
            
            }
        }
    
    
}
