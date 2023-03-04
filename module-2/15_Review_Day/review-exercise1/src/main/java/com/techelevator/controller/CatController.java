package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.service.CatFactService;
import com.techelevator.service.CatPicService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class CatController {

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

    /**
     *
     * @return
     */

    @RequestMapping(path = "/api/cards", method = RequestMethod.GET)
    public CatCard list(){
        return list();
    }

    /**
     * provides a cat card with the given id
     *
     * @param id
     * @return
     */

    @RequestMapping(path = "/api/cards/{id}", method = RequestMethod.GET)
    public CatCard listById(@PathVariable int id){
        return catCardDao.get(id);
    }

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    public CatCard getRandomCard(){
        CatCard newCard = new CatCard();
        newCard.setCatCardId(catFactService.getFact());
    }

    /**
     * updates a card in the users collection
     *
     * @param id
     * @return
     */

    @RequestMapping(path = "api/cards/{id}", method = RequestMethod.PUT)
    public CatCard updateCard(@PathVariable int id){
        return catCardDao.get(id);
    }

    /**
     * removes a card from the users collection
     *
     * @return
     */

    @RequestMapping(path = "api/cards/{id}", method = RequestMethod.DELETE)
    public CatCard deletesCard(@PathVariable int id){
        return catCardDao.get(id);
    }


}
