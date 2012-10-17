package common;

// import org.dom4j.Document;
import org.dom4j.Element;

import dbTool.Article;

public interface PicProcess {
	public boolean processPicNode(Element picConfigNode) throws HostConfigException;
	public boolean processHtml(org.jsoup.nodes.Document doc, Article article );
}