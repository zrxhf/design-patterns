package src.headfirst.decorator.starbuzz;

/**
 * 抽象装饰者
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
