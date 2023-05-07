/*import java.util.Arrays;
import java.util.List;
public class TermFrequency {
	
	public void printlist(List<String>doc)
	{
		for(String word: doc)
		{
			System.out.println(word+" ");
		}
		System.out.println("\n");
	}
	
	public void printListofLists(List<List<String>>docs)
	{
		for(List<String>doc:docs)
		{
			for(String word:doc)
			{
				System.out.println(word+" ");
			}
			System.out.println("\n");
		}
		
		}
	public static void main(String[] args) {
		TermFrequency freq=new TermFrequency();
		List<String>doc1=Arrays.asList("the","sky","is","blue");
		List<String>doc2=Arrays.asList("the","sun","is","bright");
		List<String>doc3=Arrays.asList("the","sun","in","sky","is","bright");
		List<List<String>> corpus=Arrays.asList(doc1,doc2,doc3);
		
		freq.printlist(doc1);
		freq.printlist(doc2);
		freq.printlist(doc3);
		System.out.println("\nDocument Collection:");
		freq.printListofLists(corpus);
		
		

	}

}*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TermFrequency {
	
	

	public  static double tf(List<String>doc,String term)
	{
		double count=0;
	
		for(String w: doc)
		{
			//System.out.println(w+" ");
			if(w.equals(term))
			{
				count++;
			}
		}
		//System.out.println("total no of term is:"+count);
		return count/doc.size();
		
	}
		
		
		
	
	public static void printList(List<List<String>>corpus)
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
	public static double idfListofLists(List<List<String>>corpus,String term)
	{
		
		double Ndoc=0,dfs=0;
		double idfs=0;
		for(List<String>word:corpus)
		{
			Ndoc++;
		if(word.contains(term))
		{
			dfs++;
			
		}
			}
		idfs= (double)Math.log(Ndoc/dfs);
		//System.out.println(Ndoc);
		//System.out.println(dfs);
		
		
		
		return idfs;
		
		}
	
	static double tfidfList(List<List<String>>corpus,List<String>doc ,String term)
	{ 

		
		
		
	return ( tf(doc, term)*idfListofLists(corpus, term));
	}
	public static List<String>unique_Word_fun(List<List<String>>docs)//,List<List<String>>corpus1)
	{
		List<String>temp= new ArrayList<String>();
		for(List<String>doc:docs)
			//for(List<String>word:corpus1)
		{
			for(String x:doc)
			
			{
				if(!temp.contains(x))
				{
					temp.add(x);
				}
			}
		}
		return temp;
	}
	
	
	public static double cosine_Similarity(double[] Array, double[] Array1)
	{
		 double dotProduct = 0.0;
		    double magcorpus = 0.0;
		    double magcorpus1 = 0.0;
		    for (int i = 0; i <Array.length; i++) {
		        dotProduct += Array[i] * Array1[i];
		        magcorpus += Math.pow(Array[i], 2);
		        magcorpus1 += Math.pow(Array1[i], 2);
	}
		    return dotProduct / (Math.sqrt(magcorpus) * Math.sqrt(magcorpus1));
	}
	
	
	
	
	public static void main(String[] args)
	{
	
		TermFrequency freq=new TermFrequency();
		
		
	//	List<String>doc1=Arrays.asList("the","sky","the","is","blue");
	  //  freq.tf(doc1,"the");
	    TermFrequency freq1=new TermFrequency();
	    TermFrequency freq2=new TermFrequency();
	    TermFrequency freq3=new TermFrequency();
	    List<String>doc1=Arrays.asList("the","sky","the","is","Blue");
		List<String>doc2=Arrays.asList("the","sky","is","Bright");
		List<String>doc3=Arrays.asList("the","sky","is","Blue","the","sky","is","Bright");
		List<String>doc4=Arrays.asList("my","name","is","sumitra");
		List<String>doc5=Arrays.asList("the","sun","is","Bright");
		List<String>doc6=Arrays.asList("the","sky","is","bright","and","Blue");
		List<List<String>>corpus=Arrays.asList(doc1,doc2,doc3);
		List<List<String>>corpus1=Arrays.asList(doc4,doc5,doc6);
		/*document vector*/
		List<String>store=unique_Word_fun(corpus);
		List<String>tempstore=unique_Word_fun(corpus1);
	    double Array[]=new double[store.size()];
	    double Array1[]=new double[tempstore.size()];
	   double cs=cosine_Similarity(Array, Array1);
	//System.out.println(cs);
	  System.out.println("collectio of uniqueword in corpus is:"+store);
	  System.out.println("collection of uniqueword in corpus1 is:"+tempstore);
	
	
	  for(int i=0;i<store.size();i++)
	  {
	
		 Array[i]= tfidfList(corpus,doc1,store.get(i));
		// System.out.print("tf_idf score of unique word in corpus:"+Array[i]+" ");
		 
	  }
	  for(int i=0;i<tempstore.size();i++)
	  {
		Array1[i]= tfidfList(corpus1,doc4,tempstore.get(i));
	//	System.out.print("tf_idf score of unique word in corpus1:"+Array1[i]+" ");
	  }
	  
	
	  System.out.print(" [");
	  for(int i=0;i<store.size();i++)
	   {
	
		System.out.print(Array[i]+"\t");
		 
	  }
	  System.out.print(" ]\n");
	    System.out.print(" [");
	  for(int i=0;i<tempstore.size();i++)
	  {
	
		System.out.print(Array1[i]+"\t");
		 
      }
	     System.out.print(" ]\n");
		
		double s= freq.tf(doc2,"Bright");
		double k=freq2.cosine_Similarity(Array, Array1);
		System.out.println("cosine similarity is:"+k);
		System.out.println("no of term is: "+s);
		System.out.println("Document Collection:");
		freq1.printList(corpus);
		double  y=freq1.idfListofLists(corpus,"Bright");
		System.out.println("idfs of term is: "+y);
	double z=freq2.tfidfList(corpus,doc2, "Bright");
	 
	System.out.println("multiply of term in  tf and idf is: "+z);
	
	
	}
	}	
	
	
	

