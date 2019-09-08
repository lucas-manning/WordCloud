import java.util.ArrayList;

public class WordList{
	private String sample;
	public int wordCount;
	public ArrayList<Word> wList = new ArrayList<Word>();
	
	public WordList(String s) {
		sample = s;
		wordCount = countWords();
	}
	
	public WordList() {
		
	}

	public void makeList() {
		boolean spaceBegin = false;
		boolean spaceEnd = false;
		
		for (int i = 0; i < sample.length()-1; i++)
		{
			
			int a = 0;
			
			spaceBegin = false;
			spaceEnd = false;
				
			if(" ".equals(sample.substring(i,i+1))){
				
				spaceBegin = true;
				for(int o = (i+1); spaceEnd != true ; o++) {
					if(" ".equals(sample.substring(o, o+1)) || ".".equals(sample.substring(o,o+1))) {
						spaceEnd = true;
						a = o+1;
					}
				}
			}			
            
			if(spaceBegin && spaceEnd) {
				Word entryWord = new Word();
				
				entryWord.setName(sample.substring(i, a));
				
				wList.add(entryWord);
				}
			}
		
		for(int i = 0; i < wList.size(); i++) {
			wList.set(i, cleanUp(wList.get(i)));
		}
		
		makeImport();
	}
	
	 private  int countWords()
	    {
	       int count = 0;
	        //if (!(" ".equals(sample.substring(0, 1))) || !(" ".equals(sample.substring(sample.length() - 1))))
	        //{
	            for (int i = 0; i < sample.length(); i++)
	            {
	                if (sample.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        //}
	        return count;
	    }
	 
	 private Word cleanUp(Word w) {
		 String n = w.getName();
		 double i = w.getImp();
		 
		 for(int o = 0; o < n.length()-1; o++) {
			 if(n.contains(" ")) {
				 n = n.substring(o+1,n.length()-1);
			 }
		 }
		 
		 Word wn = new Word();
		 wn.setImp(i);
		 wn.setName(n);
		 
		 return wn;
	 }
	 	 
	 public void makeImport() {
		 
		 
		 
		 for(int i = 0; i < wList.size(); i++){
			 wList.get(i).setImp(1);
		 }
		 
		 for(int i = 0; i < wList.size(); i++) {
			
			 int a = 1;
			 
			 for(int o = i+1; o < wList.size(); o++) {
				 if(wList.get(i).getName().equals(wList.get(o).getName())){
					 a++;
				 }
			 }
			 
			 double g = 0;
			 
			 g = (double)a/wList.size();
			 
			 //System.out.println(g);
			 
			 wList.get(i).setImp(g);
		 }
	 }
	 
	 public ArrayList<Word> realList(){
		 ArrayList<Word> rList = new ArrayList<Word>();
		 
		 for(int ii = 0 ; ii < wList.size(); ii++) {
			 
			 for(int oo = ii+1 ; oo < wList.size(); oo++) {
				 
				 if(wList.get(ii).getName().equals(wList.get(oo).getName())) {
					 
					 rList.add(wList.get(ii));
					 break;
				 }
			 }
		 }
		 
		 return rList;
	 }
	 
	 public ArrayList<Word> getList(){
		 return wList;
	 }
	 
	 public Word get(int n) {
		 //String nr = wList.get(n).getName();
		 //double ir = wList.get(n).getImp();
		 
		 //return nr + " " + ir;
		 
		 return wList.get(n);
	 }
	 
	 public void printList() {
		 for(int i = 0; i < wList.size(); i++) {
			 System.out.println(get(i).getName() + "	" + get(i).getImp());
		 }
	 }
	 
	 public String print() {
		 return ("aaa" + " 1223");
	 }
	 
	 public int countChars() {
		 int c = 0;
		 
		 for(c = 0; c < sample.length(); c++) {
			 
		 }
		 
		 return c;
	 }
	 
}
