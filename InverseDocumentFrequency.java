import java.util.Arrays;
import java.util.List;

public class InverseDocumentFrequency {
	
	public void printList(List<List<String>>corpus)
	{
		for(List<String>doc:corpus)
		{
			for(String word:doc)
			{
				System.out.print(word+" ");
			}
			System.out.print("\n");
		}
			
	}
	
	public double idfListofLists(List<List<String>>corpus,String docterm)
	{
		
		int Ndoc=0,dfs=0;
		double idfs=0.0;
		for(List<String>doc:corpus)
		{
			Ndoc++;
		if(doc.contains(docterm))
		{
			dfs++;
			
		}
			}
		idfs= (double)Math.log(((double)Ndoc/dfs));
		
		
		
		return idfs;
		
		}
	
	
		
	public static void main(String[] args) {
		
		
		InverseDocumentFrequency freq=new InverseDocumentFrequency();
		List<String>doc1=Arrays.asList("the","sky","is","Blue");
		List<String>doc2=Arrays.asList("the","sky","is","Bright");
		List<String>doc3=Arrays.asList("the","sky","is","Blue","the","sky","is","Bright");
		List<List<String>>corpus=Arrays.asList(doc1,doc2,doc3);
		System.out.println("Document Collection:");
		freq.printList(corpus);
	
		double  y=freq.idfListofLists(corpus,"Bright");
		System.out.println("idfs of term is: "+y);
      
	//int x=   freq.idfListofLists(corpus);
	//System.out.println(x);
	
	}
}


