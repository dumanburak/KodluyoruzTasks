public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int matSoz, int fizik, int fizikSoz, int kimya, int kimyaSoz) {

        if ((mat >= 0 && mat <= 100) && (matSoz >= 0 && matSoz <= 100)) {
            this.mat.note = mat;
            this.mat.performanceNote = matSoz;
            this.mat.finalNote = (this.mat.performanceNote * 0.20) + (this.mat.note* 0.80);
        }

        if ((fizik >= 0 && fizik <= 100) && (fizikSoz >= 0 && fizikSoz <= 100)) {
            this.fizik.note = fizik;
            this.fizik.performanceNote = fizikSoz;
            this.fizik.finalNote = (this.fizik.performanceNote * 0.20) + (this.fizik.note* 0.80);
        }

        if ((kimya >= 0 && kimya <= 100) && (kimyaSoz >= 0 && kimyaSoz <= 100)) {
            this.kimya.note = kimya;
            this.kimya.performanceNote = kimyaSoz;
            this.kimya.finalNote = (this.kimya.performanceNote * 0.20) + (this.kimya.note* 0.80);
        }

    }

    public void isPass() {
        if (this.mat.finalNote == 0 || this.fizik.finalNote == 0 || this.kimya.finalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.finalNote + this.kimya.finalNote + this.mat.finalNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.finalNote);
        System.out.println("Fizik Notu : " + this.fizik.finalNote);
        System.out.println("Kimya Notu : " + this.kimya.finalNote);
    }
}