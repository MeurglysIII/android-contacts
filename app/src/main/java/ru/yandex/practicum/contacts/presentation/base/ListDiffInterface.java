package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T>{

    boolean theSameAs(T list);

    boolean equals(Object o);
}
