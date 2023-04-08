import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default {
    getTopic(topicID) {
        return http.get('/topics').then( (response) => {
            const topics = response.data.topics;
            return topics.find(topic => topic.id == topicID);
        });
    },

    getTopics() {
        return http.get('/topics');
    }, 

    getTopicsDetails(topicID) {
        return http.get(`/topics/${topicID}`);
    },

}