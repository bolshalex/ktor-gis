<template>
  <v-layout ref="app" class="rounded rounded-md">
    <v-app-bar color="grey-lighten-2" name="app">
      <child v-slot="{ print }">
        <v-btn class="mx-auto" @click="print('app-data')"> get data</v-btn>
      </child>
    </v-app-bar>
  </v-layout>

</template>

<script >
export default {
  components: {Child}
}
import {useLayout} from "vuetify";

const Child = {
  setup(props, ctx) {
    const { getLayoutItem } = useLayout()

    function print(key) {
      alert(JSON.stringify(getLayoutItem(key), null, 2))
    }

    return () => ctx.slot.default({print})
  }
}
</script>

<style scoped>

</style>
