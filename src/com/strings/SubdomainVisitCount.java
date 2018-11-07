package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
	public static void main(String[] args) {
		SubdomainVisitCount obj = new SubdomainVisitCount();
		String[] arr = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		System.out.println(obj.subdomainVisits(arr));
	}

	public List<String> subdomainVisits(String[] cpdomains) {
		if (cpdomains == null) {
			return null;
		}

		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for (String string : cpdomains) {
			String[] split = string.split(" ");
			int count = Integer.parseInt(split[0]);
			String[] domains = split[1].split("\\.");
			String temp = "";
			for (int i = domains.length - 1; i >= 0; i--) {
				temp = domains[i] + (i == domains.length - 1 ? "" : ".") + temp;
				map.put(temp, map.getOrDefault(temp, 0) + count);
			}

		}
		System.out.println(map);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			list.add(entry.getValue() + " " + entry.getKey());
		}

		return list;
	}

}
