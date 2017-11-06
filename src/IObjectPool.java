public interface IObjectPool<T> {
    T borrowObject();
    void returnObject(T inst);
}
