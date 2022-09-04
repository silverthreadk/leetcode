class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {	
		val s = mutableSetOf<String>()
        
		for(email in emails) {
			val splitEmail = email.split('@')
			val localName = splitEmail[0].replace(".", "").split("+")[0]
			val domainName = splitEmail[1]
			
			s.add("$localName@$domainName")
		}
		
		return s.size
    }
}