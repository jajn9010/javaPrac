package ex02.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException {
		
//		URL url = new URL("https://www.google.com/search?q=kim+yuna&bih=916&biw=1707&hl=ko&sxsrf=APwXEdc31E74YvOvB1jSa-LUeggw3DN_1Q%3A1682313148277&source=hp&ei=vA9GZKPPDuyl2roP6o6--Ag&iflsig=AOEireoAAAAAZEYdzDdG6GyJWSY0RqK02EBRiwHKubgy&ved=0ahUKEwijnejs4MH-AhXsklYBHWqHD48Q4dUDCAs&uact=5&oq=kim+yuna&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEIAEMggILhCABBDLATIFCAAQgAQyCAgAEIAEEMsBMggIABCABBDLATIICAAQgAQQywEyCAgAEIAEEMsBMggIABCABBDLATIICC4QgAQQywEyCAgAEIAEEMsBOgcIIxDqAhAnOgsIABCABBCxAxCDAToECAAQAzoUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6BAguEAM6DgguEIAEELEDEMcBENEDOgsILhCABBCxAxCDAToICAAQgAQQsQM6CwguEIAEEMcBEK8BOggILhCABBCxAzoOCC4QgAQQsQMQgwEQ1AI6DgguEIMBENQCELEDEIAEOgsILhCDARCxAxCABDoHCC4QgAQQCjoKCAAQgAQQChDLAVClhAJY7ZQCYOSWAmgCcAB4AIABaogB2gaSAQM2LjOYAQCgAQGwAQo&sclient=gws-wiz");
		URL url = new URL("https://search.daum.net/search?nil_suggest=btn&w=tot&DA=SBC&q=kim+yuna");
		
//		https://www.google.com/
//		search?
//		q=kim+yuna // 속성 = 값 & 속성2 = 값2 & 속성3 = 값3......
//		&bih=916&biw=1707&hl=ko&sxsrf=APwXEdc31E74YvOvB1jSa-LUeggw3DN_1Q%3A1682313148277
//		&source=hp&ei=vA9GZKPPDuyl2roP6o6--Ag
//		&iflsig=AOEireoAAAAAZEYdzDdG6GyJWSY0RqK02EBRiwHKubgy
//		&ved=0ahUKEwijnejs4MH-AhXsklYBHWqHD48Q4dUDCAs&uact=5
//		&oq=kim+yuna
//		&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEIAEMggILhCABBDLATIFCAAQgAQyCAgAEIAEEMsBMggIABCABBDLATIICAAQgAQQywEyCAgAEIAEEMsBMggIABCABBDLATIICC4QgAQQywEyCAgAEIAEEMsBOgcIIxDqAhAnOgsIABCABBCxAxCDAToECAAQAzoUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6BAguEAM6DgguEIAEELEDEMcBENEDOgsILhCABBCxAxCDAToICAAQgAQQsQM6CwguEIAEEMcBEK8BOggILhCABBCxAzoOCC4QgAQQsQMQgwEQ1AI6DgguEIMBENQCELEDEIAEOgsILhCDARCxAxCABDoHCC4QgAQQCjoKCAAQgAQQChDLAVClhAJY7ZQCYOSWAmgCcAB4AIABaogB2gaSAQM2LjOYAQCgAQGwAQo&sclient=gws-wiz
		
		//URL 이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
		
	}
}
