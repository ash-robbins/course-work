import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home.vue';
import Messages from '../views/Messages.vue';
import TopicDetails from '../components/TopicDetails.vue';
import TopicList from '../components/TopicList.vue'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/',
    name: 'topic',
    component: TopicList
  },
  {
    path: 'topics/:id',
    name: 'topic',
    component: TopicDetails
  },
  {
    path: '/:id',
    name: 'Messages',
    component: Messages
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

export default router;
