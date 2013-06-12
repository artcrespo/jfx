/* 
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.effect;

/**
Builder class for javafx.scene.effect.PerspectiveTransform
@see javafx.scene.effect.PerspectiveTransform
@deprecated This class is deprecated and will be removed in the next version
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class PerspectiveTransformBuilder<B extends javafx.scene.effect.PerspectiveTransformBuilder<B>> implements javafx.util.Builder<javafx.scene.effect.PerspectiveTransform> {
    protected PerspectiveTransformBuilder() {
    }
    
    /** Creates a new instance of PerspectiveTransformBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.effect.PerspectiveTransformBuilder<?> create() {
        return new javafx.scene.effect.PerspectiveTransformBuilder();
    }
    
    private int __set;
    private void __set(int i) {
        __set |= 1 << i;
    }
    public void applyTo(javafx.scene.effect.PerspectiveTransform x) {
        int set = __set;
        while (set != 0) {
            int i = Integer.numberOfTrailingZeros(set);
            set &= ~(1 << i);
            switch (i) {
                case 0: x.setInput(this.input); break;
                case 1: x.setLlx(this.llx); break;
                case 2: x.setLly(this.lly); break;
                case 3: x.setLrx(this.lrx); break;
                case 4: x.setLry(this.lry); break;
                case 5: x.setUlx(this.ulx); break;
                case 6: x.setUly(this.uly); break;
                case 7: x.setUrx(this.urx); break;
                case 8: x.setUry(this.ury); break;
            }
        }
    }
    
    private javafx.scene.effect.Effect input;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getInput() input} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B input(javafx.scene.effect.Effect x) {
        this.input = x;
        __set(0);
        return (B) this;
    }
    
    private double llx;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getLlx() llx} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B llx(double x) {
        this.llx = x;
        __set(1);
        return (B) this;
    }
    
    private double lly;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getLly() lly} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B lly(double x) {
        this.lly = x;
        __set(2);
        return (B) this;
    }
    
    private double lrx;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getLrx() lrx} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B lrx(double x) {
        this.lrx = x;
        __set(3);
        return (B) this;
    }
    
    private double lry;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getLry() lry} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B lry(double x) {
        this.lry = x;
        __set(4);
        return (B) this;
    }
    
    private double ulx;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getUlx() ulx} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B ulx(double x) {
        this.ulx = x;
        __set(5);
        return (B) this;
    }
    
    private double uly;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getUly() uly} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B uly(double x) {
        this.uly = x;
        __set(6);
        return (B) this;
    }
    
    private double urx;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getUrx() urx} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B urx(double x) {
        this.urx = x;
        __set(7);
        return (B) this;
    }
    
    private double ury;
    /**
    Set the value of the {@link javafx.scene.effect.PerspectiveTransform#getUry() ury} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B ury(double x) {
        this.ury = x;
        __set(8);
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.effect.PerspectiveTransform} based on the properties set on this builder.
    */
    public javafx.scene.effect.PerspectiveTransform build() {
        javafx.scene.effect.PerspectiveTransform x = new javafx.scene.effect.PerspectiveTransform();
        applyTo(x);
        return x;
    }
}