public class ObjectPool<T> implements IObjectPool<T> {

    java.util.Stack<T> listOfInstances;
    IFactory<T> factory;

    public ObjectPool(IFactory<T> factory) {
        this.listOfInstances = new java.util.Stack<>();
        this.factory = factory;
    }

    @Override
    public T borrowObject() {
        if (listOfInstances.isEmpty()) {
            listOfInstances.add(this.factory.build());
        }
        return listOfInstances.pop();
    }

    @Override
    public void returnObject(T object) {
        listOfInstances.add(object);
    }
}
