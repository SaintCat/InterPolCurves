/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.saintcat.client.interpolcurves;

/**
 *
 * @author Chernyshov
 */
public class Vector2D {

    double x;
    double y;
    static double dim = Double.MAX_VALUE;

    public Vector2D(double xx, double yy) {
        x = xx;
        y = yy;
    }

    public Vector2D() {
        x = y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double xx) {
        x = xx;
    }

    public void setY(double yy) {
        y = yy;
    }

    public void check() {
        if (x < 0) {
            x = dim + x;
        }
        if (y < 0) {
            y = dim + y;
        }
    }

    public static void setDim(double d) {
        dim = d;
    }

    public void minus(Vector2D v) {
        add(v.neg());
    }

    public void add(Vector2D v) {
        x += v.getX();
        y += v.getY();
    }

    public Vector2D neg() {
        return new Vector2D(-x, -y);
    }

    public static double dist(Vector2D v, Vector2D u) {
        Vector2D d = new Vector2D(v.getX(), v.getY());
        d.minus(u);
        return Math.sqrt(d.getX() * d.getX() + d.getY() * d.getY());
    }

    public static double multipl(Vector2D v, Vector2D u) {
        return v.getX() * u.getX() + v.getY() * u.getY();
    }

    @Override
    public Vector2D clone() {
        return new Vector2D(x, y);
    }
}
