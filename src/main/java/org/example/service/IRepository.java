package org.example.service;

import org.example.data.Figure;

public interface IRepository<T extends Figure> {
    public void add(T value);
}
