package PJchapters7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
public static void main(String[] args) {
Map <String,Employee>hashmap=new HashMap<String,Employee>();
	Employee e1=new Employee("���","0004");
	Employee e2=new Employee("�Ż�","0001");
	Employee e3=new Employee("����","0003");
	Employee e4=new Employee("������","0002");
    hashmap.put("0001",e2);
    hashmap.put("0002", e4);
	hashmap.put("0003",e3);
	hashmap.put("0004", e4);
//	System.out.println(hashmap.get("0004").show());
	Iterator it=hashmap.keySet().iterator();//entryset���ؼ�-ֵ ��ͼ����.iterator���õ�����
	while(it.hasNext()) {
		System.out.println(hashmap.get(it.next()).show());
	}
	Employee employee=hashmap.get("0002");
	employee.setSalary(3000);
	System.out.println(employee.show());
	hashmap.remove("0003");
	System.out.println("   ");
	it=hashmap.keySet().iterator();
	while(it.hasNext()){
		System.out.println(hashmap.get(it.next()).show());
	}
	
	
	
}}

