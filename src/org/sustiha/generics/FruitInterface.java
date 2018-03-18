package org.sustiha.generics;

import java.util.Collection;

/**
 * Created by sustihashreesampath on 12/19/16.
 */
public interface FruitInterface<E> {

    boolean addAll(Collection<? extends E> c);
}
