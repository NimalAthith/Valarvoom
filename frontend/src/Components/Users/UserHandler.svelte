<script lang="ts">
  import CreateUser from "./CreateUser.svelte";
  import UserSelector from "./UserSelector.svelte";

  let isInCreate = false;
</script>

{#if isInCreate}
  <CreateUser bind:isInCreate />
{:else}
  <UserSelector bind:isInCreate />
{/if}
