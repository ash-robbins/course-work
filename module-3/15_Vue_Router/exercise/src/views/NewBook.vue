<template>
  <div class="new-book">
      <h1>New Book</h1>
      <new-book-form/>
  </div>
</template>

<script>
import NewBookForm from '../components/NewBookForm.vue';
export default {
name: 'new-book',
components: {
    NewBookForm
}
}
</script>

<style>

</style>