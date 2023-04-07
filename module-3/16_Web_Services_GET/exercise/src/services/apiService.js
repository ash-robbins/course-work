import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default {
    getTopic() {
        return http.get('/');
    },

    getTopics() {
        return http.get('/');
    }, 

    getTopicsDetails(topicID) {
        return http.get(`/topics/${topicID}`);
    },

}