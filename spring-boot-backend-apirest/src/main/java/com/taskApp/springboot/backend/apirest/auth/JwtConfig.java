package com.taskApp.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String SECRET_KEY="PWD$1234567";
	
	public static final String RSA_PRIVATE="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAzJ00zaAmqvuYOPAKutbQPXdFS+wN555Zciw5coSa8fhYeleb\r\n" + 
			"/uGl7Oo0D+mtUoQMG6QDCctR4yTy9cXy0jbLCU2ljWXkR06zsjVJmDto7E3t3Xp/\r\n" + 
			"ocyzZlmOtoWoVeYfqx64dvzp7hPmMRVlj92pi0jbbM4X8ZG3mhkMs9+9wKLW+IAZ\r\n" + 
			"Yl8IFkVqxqxf0UnVdOtO/tzn6d7+K+Yvmg15V4Vi5rZyycJKL3CEyExjoe1hHD7Q\r\n" + 
			"merBu7ezv4qw9Sc4hRkOKBOy0dvmzTNdlZLyV9OLcygQJpVGYR20AI2Agv5ZRGRn\r\n" + 
			"CiFkUZFUfQvrTXwp6vn7LlW9Z46uz0w6+Wh8xwIDAQABAoIBAQCD4AKLUN/7LYLz\r\n" + 
			"l4pi11aJdxi7kR15Ha7qjiRMcbjnoTdtSo/pG4f0hRIe+23RE/g1zGSE6H0Tl9nb\r\n" + 
			"m8Qfxl7f1SKRWo1hhBD/F6ciLZA3VRasu2oNX0B1A92eN9DB5Dqe8ILVdbZT0pF3\r\n" + 
			"KyI1Mhk3AzMhEkeOU2txLxnnyJmk0GgTAoMoYggff3OjoWUxIPPHIm9k+TqZMoGP\r\n" + 
			"yRBL+JSwfrvwSBeUwKH8l+XmZKIOQtvEY9/tqGtwJ7r+Txlnb/l0Q9dr09sp4OHL\r\n" + 
			"lEBn4Pppr1eSIHSTp6UFmxx+YP0TCUW7EBKC7qLSAJg9t5tss1DQ6arAAvK2NStF\r\n" + 
			"wSEXkWeZAoGBAObYqCY4+TALuFRE7TJBrdd1CMD59LPYsmx6NC7O5TqXRuhSS1be\r\n" + 
			"VKASwkHNY81YwXEismLQP/td9FY3s3X6K6om+g/8RI0ghgi30YHLNdod8zwxES9J\r\n" + 
			"cqkI5iw2sjMTc7uyWCn+vw/Zn2cGxH58EDgwsNggEpY9XgLLBvYssOaFAoGBAOLo\r\n" + 
			"0IALYkPXLss//+PBjI5Xgo+4Qk+nLVDotHgl0IxScFstzbyJWJGQi3U0KtKAAPXg\r\n" + 
			"X9aGwqdU7PDyLRCA39pkapi3WBiSoy+8ua9aLtM5+xD2gvxazbMNfLBkfmaLlRur\r\n" + 
			"HcM91sVEcDIdxlkykiwdlQN0+Dg06Y1co9LMfvXbAoGAaC9cJHQOMtr3REEfdFEk\r\n" + 
			"LluJqd6lzA1+6Wp15rJFzp27yNprWjdZpi0RMzWJV4I5O+BW9jXayo3q2oalHhfc\r\n" + 
			"YRzaOyC1p6QIGiMsERIvqdNelcnnYZoaf6OejlHZNygOUaX6GGn6vSKQyKTLRfKk\r\n" + 
			"N1fyWHiRKvFjXotXBv/AjykCgYA9otQQFAeLOgZh+2585XRSrf6vH3QTwuuSUMPE\r\n" + 
			"5zCxDSur+NMr5XsDf2oCWjtPlqmsIFioI074uR7rjD0lgHxODHzQIu1xL1PYgcFG\r\n" + 
			"mo6hndxPDUcjWV8Kxh0apRGYtU25iE+7Wy7dwutfEatxS0VdamOx3rIWQnk2hvWR\r\n" + 
			"Ky9JhQKBgQChL9MrelzKZoEOY8g3Bap1rplSgE3ztfSvLIU9SgTWKV2y+fE9bvfC\r\n" + 
			"3iB5eDDlLFlH/QO4iwyB5wpm86xnoZUta0va8cNa26Jvg4v0hgjvujsRGbtj1MBu\r\n" + 
			"DgcWTQZZ4KQJvb63eTY5WOvZhrsMowz5UXAJFybrdlgO562s+t1TAQ==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzJ00zaAmqvuYOPAKutbQ\r\n" + 
			"PXdFS+wN555Zciw5coSa8fhYeleb/uGl7Oo0D+mtUoQMG6QDCctR4yTy9cXy0jbL\r\n" + 
			"CU2ljWXkR06zsjVJmDto7E3t3Xp/ocyzZlmOtoWoVeYfqx64dvzp7hPmMRVlj92p\r\n" + 
			"i0jbbM4X8ZG3mhkMs9+9wKLW+IAZYl8IFkVqxqxf0UnVdOtO/tzn6d7+K+Yvmg15\r\n" + 
			"V4Vi5rZyycJKL3CEyExjoe1hHD7QmerBu7ezv4qw9Sc4hRkOKBOy0dvmzTNdlZLy\r\n" + 
			"V9OLcygQJpVGYR20AI2Agv5ZRGRnCiFkUZFUfQvrTXwp6vn7LlW9Z46uz0w6+Wh8\r\n" + 
			"xwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
