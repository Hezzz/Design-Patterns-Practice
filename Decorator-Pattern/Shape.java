/**
 * The decorator pattern was quite confusing when applied to
 * a very obtuse example.
 * 
 * In this source code, I will be using a `Shape` to be decorated.
 * The common behavior among shapes and its decorators
 * is being able to `draw`.
 * 
 * Decorator classes will have additional 'decorating' behaviors
 * or methods that will be called within the `draw` method, which
 * recursively then calls the `draw` method of the 'decorated' `Shape`.
 * 
 * This is how I basically interpreted the purpose of the decorator pattern.
 */

public interface Shape{
    public void draw();
}
