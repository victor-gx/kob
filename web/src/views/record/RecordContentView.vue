<template>
    <PlayGround />
    <div class="child">对战录像</div>
</template>

<script>
import PlayGround from '../../components/PlayGround.vue'

export default {
    components: {
        PlayGround,
    },
    setup() {
    }
}
</script>

<style scoped>
.child {
    display: table;
    margin: 0 auto;
    color: white;
}
</style>