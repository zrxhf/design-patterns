package src.headfirst.strategy;


public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoy = new DecoyDuck();
        Duck redHead = new RedHeadDuck();
        Duck model = new ModelDuck();

        mallard.performFly();
        rubberDuck.performFly();
        decoy.performFly();
        redHead.performFly();
        model.performFly();

        mallard.performQuack();
        rubberDuck.performQuack();
        decoy.performQuack();
        redHead.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
