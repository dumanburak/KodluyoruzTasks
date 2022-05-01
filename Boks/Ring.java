public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {

            while (this.f1.health > 0 && this.f2.health > 0) {

                while (this.f1.luck == this.f2.luck) {
                    this.f1.luck = Math.round(Math.random());
                    this.f2.luck = Math.round(Math.random());
                }

                System.out.println("\n====YENÝ ROUND====");

                if (this.f1.luck > this.f2.luck) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.luck = 0;
                    this.f2.luck = 1;
                }

                if (this.f1.luck < this.f2.luck) {

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                    this.f1.luck = 1;
                    this.f2.luck = 0;
                }

                System.out.println(this.f1.name + " Saðlýk : " + this.f1.health);
                System.out.println(this.f2.name + " Saðlýk : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcularýn sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandý !");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandý !");
            return true;
        }

        return false;
    }
}   