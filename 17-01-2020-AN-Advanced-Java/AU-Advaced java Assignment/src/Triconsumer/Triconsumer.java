package Triconsumer;
@FunctionalInterface
public interface Triconsumer<T , U, R > {
	public void consume(T t, U u, R r);

}
