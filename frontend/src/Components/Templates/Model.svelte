<script lang="ts">
  import { fly } from "svelte/transition";

  export let name: string;
</script>

<div
  class="p-5 shadow-2xl sm:rounded-3xl rounded-t-3xl sm:m-auto mt-auto flex gap-3 flex-col max-sm:w-screen bg-white"
  in:fly={{ y: 600, x: 0 }}
>
  <span class="text-black text-lg text-center decoration-double font-extrabold"
    >{name}</span
  >
  <hr />
  <slot />
</div>
