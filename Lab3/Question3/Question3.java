
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Question3 {
    public static void main(String[] args) {
        Publication publication = new Publication("Sir Lacelot of the Round Table", "A tale when a Kingdom fell", 1195);
		Book book = new Book("Ahmed", "A book about spiders", 2032, "Limited Edition", "KOEI TECHMO");
		Article article = new Article("An article who can write itself", "Artificial Intelligence: From the right perspective", 2122, "World Domination", 0, 69, 420);
		TechReport techReport = new TechReport("Aiman", "An uprising has occured", 1970, "Kampung UPM", 1);
		
		System.out.println();
		System.out.println(publication.toString());
		System.out.println(book.toString());
		System.out.println(article.toString());
		System.out.println(techReport.toString());
    }
}
