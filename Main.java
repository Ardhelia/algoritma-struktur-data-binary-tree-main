package tree1b;

public class Main {
    public static void main(String[] args) {
        // Membuat objek BinarySearchTree (pohon BST kosong)
        BinarySearchTree bst = new BinarySearchTree();

        // Menambahkan nilai-nilai ke dalam pohon
        // Nilai-nilai ini akan membentuk struktur pohon BST secara otomatis
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Menampilkan traversal inorder
        System.out.println("Inorder traversal:");
        bst.inorder(); 

        // Menampilkan traversal postorder
        System.out.println("Postorder traversal:");
        bst.postorder();  // Output: 20 40 30 60 80 70 50

        // Mencari apakah sebuah angka ada di dalam pohon
        System.out.println("Apakah 20 ada di dalam pohon? " + bst.search(20));   // true
        System.out.println("Apakah 100 ada di dalam pohon? " + bst.search(100)); // false

        // Menghapus nilai 20 dari pohon
        // menampilkan kembali traversal inorder dan postorder
        System.out.println("\nSetelah menghapus 20:");
        bst.delete(20);
        System.out.print("Inorder:   ");
        bst.inorder();       
        System.out.print("Postorder: ");
        bst.postorder();     

        // Menghapus nilai 30 dari tree
        System.out.println("\nSetelah menghapus 30:");
        bst.delete(30);
        System.out.print("Inorder:   ");
        bst.inorder();       
        System.out.print("Postorder: ");
        bst.postorder();     

        // Menghapus nilai 50 dari pohon (nilai akar/root)
        System.out.println("\nSetelah menghapus 50 (root):");
        bst.delete(50);
        System.out.print("Inorder:   ");
        bst.inorder();       
        System.out.print("Postorder: ");
        bst.postorder();     
    }
}
