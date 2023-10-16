package com.example.pizzaapp.service;


import java.util.ArrayList;
import java.util.List;

import com.example.pizzaapp.classes.Produit;
import com.example.pizzaapp.dao.IDao;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit f : produits)
            if(f.getId() == id)
                return f;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit f = findById(o.getId());
        f.setNom(o.getNom());
        f.setNbrIngredients(o.getNbrIngredients());
        f.setPhoto(o.getPhoto());
        f.setDuree(o.getDuree());
        f.setDetaisIngred(o.getDetaisIngred());
        f.setDescription(o.getDescription());
        f.setPreparation(o.getPreparation());
        return false;
    }
}
