<template>
  <div class="my-books">
      <h1> My Books </h1>
      <reading-list />
</template>

<script>
import ReadingList from '../components/ReadingList.vue';
export default {
name: 'my-books',
components: {
    ReadingList
}
}
</script>

<style>

</style>